package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {

    /**
     * @param paramMap URI
     * @return 다형성
     */
    ModelView process(Map<String, String> paramMap);

}
