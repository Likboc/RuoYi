package likboc.authsys;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class AuthSysApplicationTests {

	@Test
	void contextLoads() {
		int[] a = new int[]{1,3,4};
		for (int i : a) {
			if(i == 1) {
				i = 2;
			}
		}
		System.out.println(a[0]);
	}

}
