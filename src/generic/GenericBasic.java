package generic;

public class GenericBasic {

	public static void main(String[] args) {
		// ��Ŀ . ���� ���̾  ��Ʈ�� �� �� �մٰ� �����Ѵ�
		// �� ������ ����
		// ������ �εεε� ���
		// ���̾���� Ǫ��Ǫ��Ǫ�� 
		// ��Ʈ�� ĨĨĨĨ ���
		// 4�������� �� �� �ִ�
		// ���� ��Ŀ�� ����ִ� ����ŭ �����Ѵ�. 
		// ��Ŀ�� ������ �ϳ��� ����, �ϳ��� �Ĺ�,�ϳ��� ��Ʈ �� 
		// �� ��Ŀ�� ���� ������ �־� �����Ѵ�
		
		Bunker<Marine> aBunker = new Bunker<>(Marine.class, 4);
		
		
		aBunker.load(new Marine("������"));
		aBunker.load(new Marine("������"));
		aBunker.load(new Marine("������"));

		//m.shoot();
		
		
		aBunker.unload(0);
		aBunker.bunkerInfo();
		aBunker.attackk();
	
	}

}
