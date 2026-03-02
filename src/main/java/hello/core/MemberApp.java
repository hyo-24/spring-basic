package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    static void main() {
        AppConfig appConfig = new AppConfig(); // main 에 관리자 객체 생성하기
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, Grade.VIP, "memberA");
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = "+member.getName());
        System.out.println("find Member = "+findMember.getName());
    }
}
