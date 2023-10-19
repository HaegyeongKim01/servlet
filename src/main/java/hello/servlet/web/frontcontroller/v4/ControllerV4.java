package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

public interface ControllerV4 {

    /**
     *
     * @param paramMap HttpServletRequest의 파라미터 정보들
     * @param model Data들. 회원 정보(username, age)
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
