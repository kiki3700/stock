package prepare;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.vo.LineChartDto;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DtoTest {
	LineChartDto dto = new LineChartDto();
	@Test
	public void linedto() {
		System.out.print("hello");
	}
}
