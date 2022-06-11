class Member {
	String name;
	String nickname;
	public Member() {}
}

/**
 * @author 진이
 * 
 * DI(Dependency Injection) : 의존 주입 관련 예제
 * 이미 만들어져 있는 객체를 참조할때 setter() or constructor()를 사용해서 접근하는데 이것을 의존 주입이라 함. 
 * 이때 참조하는 객체의 라이프 사이클을 관리하는 등의 역할을 하는 것을 컨테이너라 부른다. 
 * 개발자가 직접 객체를 제어하지 않고 컨테이너로 객체의 제어권이 넘어갔다는 의미로 제여의 역전 (Inversion of Control : IoC) 라고 부른다.
 * 스프링이 이 IoC의 역할을 한다.
 * 
 * 강한결합 : 
 * 객체 간의 의존 관계에서 직접 객체를 생성하면 생성부터 메모리 관리를 위한 소멸까지 해당 객체의 라이프 사이클을 개발자가 다 관리해야 하는 경우
 *
 * 약한 결합 : 
 * 이미 누군가가 생성한 객체를 주입받을 경우, 사용하기만 되는 경우 -> DI
 *
 */
public class UnderstandDI {

	public static void main(String[] args) {
		
		/*
		 * 약한 결합과 강한 결합의 차이점
		 * 
		 * java.lang.Integer 처럼 전체가 static 메서드로 이루어져 있는 유틸 클래스들은 
		 * 객체를 인스턴스화할 필요가 없어 흔히 클래스를 만들 때 인스턴스화를 막기 위해 생성자를 private로 만든다.
		 * 약한 결합은 이때 private 이어도 오류가 나지 않으나 강한 결합은 오류가 발생한다. 
		 * 위의 Member 클래스의 생성자를 private로 변경해보면 확인 가능하다.
		 */
		
		int num = Integer.parseInt("123");
	}
		
	
	/**
	 * 강한 결합 : 직접 생성 방법 
	 */
	public static Member memberUse1() {
		Member m1 = new Member();
		m1.name = "KIM GAP JIN";
		m1.nickname = "JINY";
		return m1;
	}
	
	/**
	 * 약한 결합 : 컨테이너 사용 (DI)
	 */
	public static void memberUse2(Member m) {
		Member m2 = m;
	}

}
