package hello.hellospring.controller

import hello.hellospring.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class MemberController(
    private val memberService: MemberService
) {


}