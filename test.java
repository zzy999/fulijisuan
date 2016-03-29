import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*; 
import static org.junit.matchers.JUnitMatchers.*;  
public class test {
    @Test
    //���Ա�����㹫ʽ
    public void testcapital_formula() {
		//double test1 = Conpound_int.capital_formula(10000, 0.03, 10,1);//������ȷ
        //assertThat(test1,is(7440.93914896725));//�����ȷ
        //assertThat(test1,is(740.93914896725));//�������
       // double test1 = Conpound_int.capital_formula(0, 0.03, 10,1);//������ֵΪ0ʱ
        //assertThat(test1,is(0.0));//�����ȷ
        //double test1 = Conpound_int.capital_formula(9999999999999999999999999.0,0.03,10,1);//����ֵΪ9999999999999999999999999.0
        //assertThat(test1,is(7.44093914896725E24));//�����ȷ
    	//double test1 = Conpound_int.capital_formula(10000, 0, 10,1);//������Ϊ0ʱ
        //assertThat(test1,is(10000.0));//�����ȷ
        double test1 = Conpound_int.capital_formula(10000.0, 0.03, 0,1);//����Ϊ0ʱ
       assertThat(test1,is(10000.0));//�����ȷ
        //double test1 = Conpound_int.capital_formula(10000.0, 0.03, 10,0);//�긴������Ϊ0ʱ
       // assertThat(test1,is(0.0));

    }
	@Test
	//���Ը������㹫ʽ
    public void testcompound_amount_formla() {
		//double test2=Conpound_int.compound_amount_formla(10000, 0.03, 10, 1);
        //assertThat(test2,is(13439.163793441223));//��ȷ
        //assertThat(test2,is(324.3975100275416));//����
        //double test2=Conpound_int.compound_amount_formla(99999999999999999999999999999.0, 0.03, 10, 1);//������Ϊ99999999999999999999999999999.0
       // assertThat(test2,is(1.3439163793441221E29));
       // double test2=Conpound_int.compound_amount_formla(0.0, 0.03, 10, 1);//������Ϊ0ʱ
        //assertThat(test2,is(0.0));
       // double test2=Conpound_int.compound_amount_formla(10000.0, 0.0, 10, 1);//��������Ϊ0ʱ
        //assertThat(test2,is(10000.0));
        double test2=Conpound_int.compound_amount_formla(10000.0, 0.03, 0, 1);//������Ϊ0ʱ
        assertThat(test2,is(10000.0));
    }
    @Test
    //���Ե������㹫ʽ
    public void testsimple_interest_formula() {
		double test3=Conpound_int.simple_interest_formula(1000, 20, 0.05);
        assertThat(test3,is(2000.0));//��ȷ
        //assertThat(test3,is(200.0));//����
    }
    @Test
    //��������ݼ��㹫ʽ
    public void testyears_formula() {
		//int test4=Conpound_int.years_formula(100000, 100, 0.03, 1);//������ȷ
        //assertThat(test4,is(155));//��ȷ
        //assertThat(test4,is(130));//����
        //int test4=Conpound_int.years_formula(0.0, 1000.0, 0.03, 1);//��ֵΪ0
        //assertThat(test4,is(0));//�������
        //int test4=Conpound_int.years_formula(10000, 0.0, 0.03, 1);//����Ϊ0
       // assertThat(test4,is(0));
        //int test4=Conpound_int.years_formula(10000, 1000, 0, 1);//������Ϊ0
        //assertThat(test4,is(0));
        int test4=Conpound_int.years_formula(10000, 1000, 0.03, 0);//������Ϊ0
        assertThat(test4,is(0));
    }
    @Test
    public void testrate_formula() {
		double test5=Conpound_int.rate_formula(1, 10000, 100, 10);
        assertThat(test5,is(0.5848931924611136));//��ȷ
        //assertThat(test5,is(0.5848931924611136));//����
    }
    @Test
    public void testaccording_year_formula() {
		double test6=Conpound_int.according_year_formula(1000, 10, 0.03);
        assertThat(test6,is(11463.87931147074));//��ȷ
        //assertThat(test6,is(11463.87931147074));//����
    }
   
	@Test
    public void testaccording_month_formula() {
		double test7=Conpound_int.according_month_formula(1000, 10, 0.03);
        assertThat(test7,is(141693.54828977838));//��ȷ
        //assertThat(test7,is(141693.54828977838));//����
    }
    @Test
    public void testAverage_capital_plus_interest_formula() {
		double test8=Conpound_int.Average_capital_plus_interest_formula(1000, 10, 0.03);
        assertThat(test8,is(7.057484353168245));//��ȷ
        //assertThat(test8,is(7.057484353168245));//����
    }

}
