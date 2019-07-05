package org.cth.memory.controller.cth;

import org.cth.memory.controller.BaseController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController extends BaseController {

    @GetMapping("memory")
    public String testGet() {
        log.info(">>>memory");
        return "success memory";
    }
}
