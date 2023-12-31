package hello.hellospring

import hello.hellospring.repository.JdbcMemberRepository
import hello.hellospring.repository.MemberRepository
import hello.hellospring.service.MemberService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.sql.DataSource

@Configuration
class SpringConfig(
    @Autowired
    private val dataSource: DataSource
) {

    @Bean
    fun memberService(): MemberService {
        return MemberService(memberRepository())
    }

    @Bean
    fun memberRepository(): MemberRepository{
        return JdbcMemberRepository(dataSource)
    }

}