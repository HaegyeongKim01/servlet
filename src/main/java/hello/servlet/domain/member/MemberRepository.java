package hello.servlet.domain.member;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 위의 경우 동시성 문제가 고려되어 있지 않음,
 * 실무에서는 ConcurrentHashMap, AutomicLong 사용 고려
 */
@Getter
public class MemberRepository {

    private static final Map<Long, Member> store = new HashMap<>();
    private static Long sequence = 0L;

    //Singleton 으로 사용
    @Getter
    private static final MemberRepository instance = new MemberRepository();


    // 아무나 생성 하지 못하게 막아야 한다.
    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();   //주로 테스트에서만 사용
    }

}
