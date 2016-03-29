import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*; 
import static org.junit.matchers.JUnitMatchers.*;  
public class test {
    @Test
    //测试本金计算公式
    public void testcapital_formula() {
		//double test1 = Conpound_int.capital_formula(10000, 0.03, 10,1);//输入正确
        //assertThat(test1,is(7440.93914896725));//结果正确
        //assertThat(test1,is(740.93914896725));//结果错误
       // double test1 = Conpound_int.capital_formula(0, 0.03, 10,1);//复利终值为0时
        //assertThat(test1,is(0.0));//结果正确
        //double test1 = Conpound_int.capital_formula(9999999999999999999999999.0,0.03,10,1);//当终值为9999999999999999999999999.0
        //assertThat(test1,is(7.44093914896725E24));//结果正确
    	//double test1 = Conpound_int.capital_formula(10000, 0, 10,1);//年利率为0时
        //assertThat(test1,is(10000.0));//结果正确
        double test1 = Conpound_int.capital_formula(10000.0, 0.03, 0,1);//年限为0时
       assertThat(test1,is(10000.0));//结果正确
        //double test1 = Conpound_int.capital_formula(10000.0, 0.03, 10,0);//年复利次数为0时
       // assertThat(test1,is(0.0));

    }
	@Test
	//测试复利计算公式
    public void testcompound_amount_formla() {
		//double test2=Conpound_int.compound_amount_formla(10000, 0.03, 10, 1);
        //assertThat(test2,is(13439.163793441223));//正确
        //assertThat(test2,is(324.3975100275416));//错误
        //double test2=Conpound_int.compound_amount_formla(99999999999999999999999999999.0, 0.03, 10, 1);//当本金为99999999999999999999999999999.0
       // assertThat(test2,is(1.3439163793441221E29));
       // double test2=Conpound_int.compound_amount_formla(0.0, 0.03, 10, 1);//当本金为0时
        //assertThat(test2,is(0.0));
       // double test2=Conpound_int.compound_amount_formla(10000.0, 0.0, 10, 1);//当年利率为0时
        //assertThat(test2,is(10000.0));
        double test2=Conpound_int.compound_amount_formla(10000.0, 0.03, 0, 1);//当年限为0时
        assertThat(test2,is(10000.0));
    }
    @Test
    //测试单利计算公式
    public void testsimple_interest_formula() {
		double test3=Conpound_int.simple_interest_formula(1000, 20, 0.05);
        assertThat(test3,is(2000.0));//正确
        //assertThat(test3,is(200.0));//错误
    }
    @Test
    //测试求年份计算公式
    public void testyears_formula() {
		//int test4=Conpound_int.years_formula(100000, 100, 0.03, 1);//输入正确
        //assertThat(test4,is(155));//正确
        //assertThat(test4,is(130));//错误
        //int test4=Conpound_int.years_formula(0.0, 1000.0, 0.03, 1);//终值为0
        //assertThat(test4,is(0));//结果错误
        //int test4=Conpound_int.years_formula(10000, 0.0, 0.03, 1);//本金为0
       // assertThat(test4,is(0));
        //int test4=Conpound_int.years_formula(10000, 1000, 0, 1);//年利率为0
        //assertThat(test4,is(0));
        int test4=Conpound_int.years_formula(10000, 1000, 0.03, 0);//年利率为0
        assertThat(test4,is(0));
    }
    @Test
    public void testrate_formula() {
		double test5=Conpound_int.rate_formula(1, 10000, 100, 10);
        assertThat(test5,is(0.5848931924611136));//正确
        //assertThat(test5,is(0.5848931924611136));//错误
    }
    @Test
    public void testaccording_year_formula() {
		double test6=Conpound_int.according_year_formula(1000, 10, 0.03);
        assertThat(test6,is(11463.87931147074));//正确
        //assertThat(test6,is(11463.87931147074));//错误
    }
   
	@Test
    public void testaccording_month_formula() {
		double test7=Conpound_int.according_month_formula(1000, 10, 0.03);
        assertThat(test7,is(141693.54828977838));//正确
        //assertThat(test7,is(141693.54828977838));//错误
    }
    @Test
    public void testAverage_capital_plus_interest_formula() {
		double test8=Conpound_int.Average_capital_plus_interest_formula(1000, 10, 0.03);
        assertThat(test8,is(7.057484353168245));//正确
        //assertThat(test8,is(7.057484353168245));//错误
    }

}
