package example1;

import dollor.Dollor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class FunctionTest {
	@Test
	@DisplayName("Dollor 객체의 환율 계산 테스트 ")
	void Dollor_exchange_rate(){
		Dollor five= new Dollor(5);
		Dollor product = five.times(2);
		assertThat(product.unit).isEqualTo(10);
		product=five.times(3);
		assertThat(product.unit).isEqualTo(15);
	}
}
