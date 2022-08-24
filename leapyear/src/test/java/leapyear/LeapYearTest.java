package leapyear;

import static leapyear.LeapYear.isLeapYear;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
  
  @Test
  @DisplayName("Alle Jahre, die nicht durch 4 teilbar sind, sind keine Schaltjahre")
  void test_regular_non_leap_year(){
   assertThat(isLeapYear(2019)).isFalse();
  }

  @Test
  @DisplayName("Jahre, die durch 4, aber nicht durch 100 teilbar sind, sind Schaltjahre")
  void test_regular_leap_year(){
   assertThat(isLeapYear(2020)).isTrue();
  }

  @Test
  @DisplayName("Jahre, die durch 100, aber nicht durch 400 teilbar sind, sind keine Schaltjahre")
  void test_century_rule_for_non_leap_year(){
   assertThat(isLeapYear(1900)).isFalse();
  }
  @Test
  @DisplayName("Jahre, die durch 400 teilbar sind, sind Schaltjahre")
  void test_400years_rule_for_leap_year(){
   assertThat(isLeapYear(2000)).isTrue();
  }


}
