class Member {
	String name;
	String nickname;
	public Member() {}
}

/**
 * @author ����
 * 
 * DI(Dependency Injection) : ���� ���� ���� ����
 * �̹� ������� �ִ� ��ü�� �����Ҷ� setter() or constructor()�� ����ؼ� �����ϴµ� �̰��� ���� �����̶� ��. 
 * �̶� �����ϴ� ��ü�� ������ ����Ŭ�� �����ϴ� ���� ������ �ϴ� ���� �����̳ʶ� �θ���. 
 * �����ڰ� ���� ��ü�� �������� �ʰ� �����̳ʷ� ��ü�� ������� �Ѿ�ٴ� �ǹ̷� ������ ���� (Inversion of Control : IoC) ��� �θ���.
 * �������� �� IoC�� ������ �Ѵ�.
 * 
 * ���Ѱ��� : 
 * ��ü ���� ���� ���迡�� ���� ��ü�� �����ϸ� �������� �޸� ������ ���� �Ҹ���� �ش� ��ü�� ������ ����Ŭ�� �����ڰ� �� �����ؾ� �ϴ� ���
 *
 * ���� ���� : 
 * �̹� �������� ������ ��ü�� ���Թ��� ���, ����ϱ⸸ �Ǵ� ��� -> DI
 *
 */
public class UnderstandDI {

	public static void main(String[] args) {
		
		/*
		 * ���� ���հ� ���� ������ ������
		 * 
		 * java.lang.Integer ó�� ��ü�� static �޼���� �̷���� �ִ� ��ƿ Ŭ�������� 
		 * ��ü�� �ν��Ͻ�ȭ�� �ʿ䰡 ���� ���� Ŭ������ ���� �� �ν��Ͻ�ȭ�� ���� ���� �����ڸ� private�� �����.
		 * ���� ������ �̶� private �̾ ������ ���� ������ ���� ������ ������ �߻��Ѵ�. 
		 * ���� Member Ŭ������ �����ڸ� private�� �����غ��� Ȯ�� �����ϴ�.
		 */
		
		int num = Integer.parseInt("123");
	}
		
	
	/**
	 * ���� ���� : ���� ���� ��� 
	 */
	public static Member memberUse1() {
		Member m1 = new Member();
		m1.name = "KIM GAP JIN";
		m1.nickname = "JINY";
		return m1;
	}
	
	/**
	 * ���� ���� : �����̳� ��� (DI)
	 */
	public static void memberUse2(Member m) {
		Member m2 = m;
	}

}
