package part13;

public class SystemValue {

	public static void main(String[] args) {
		System.out.printf("이 시스템은 %s입니다.", System.getProperty("spring.profiles.active"));
	}
}
