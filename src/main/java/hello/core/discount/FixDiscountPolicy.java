package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    // 1000원 할인
    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        // VIP 등급일 때만 1000원 할인
        if(member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        } else {
            return 0;
        }
    }
}
