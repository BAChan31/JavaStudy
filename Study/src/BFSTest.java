import java.util.*;

//������İ� �ؽ� ���̺� ����� BFS
public class BFSTest {
	
	static int Ne; //������ ��
	static int Nv; //������ ��
	static int[][] adjacencyMatrix; //�������
	static boolean[] visit; //���� �湮 Ȯ��
	static Queue<Integer> queue;
	
	public static void bfs(int i) {
		queue = new <Integer> LinkedList();
		HashMap <Integer, Boolean> hash = new HashMap<Integer, Boolean>();
		
		queue.offer(i);
		
		while(!queue.isEmpty()){
			int temp = queue.poll();
			visit[temp] = true;
			System.out.print(temp);
			
			for(int j=1; j <= Ne; j++)
			{
				if(adjacencyMatrix[temp][j] == 1 && visit[j] == false)
				{
					if(!hash.containsKey(j))
					{
						queue.offer(j);
						hash.put(j,true);
					}
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Nv = scan.nextInt(); //���� ���� �Է�
		Ne = scan.nextInt(); //���� ���� �Է�
		
		adjacencyMatrix = new int[Nv+1][Nv+1];
		visit = new boolean[Nv+1];
		
		for(int i = 0; i < Nv; i++)
		{
			int t1, t2; //����� ����. t1�� t2�� �����̸� ������ ���� ǥ������ �ʱ� ������ ��Ŀ��� �̵��� ��������� ǥ��
			t1 = scan.nextInt();
			t2 = scan.nextInt();
			
			adjacencyMatrix[t1][t2] = adjacencyMatrix[t2][t1] = 1;
		}
		
		bfs(1);
	}
	
	//�������(�迭)�� ����Ͽ� Ž���ϴ� �Ͱ� ���Ḯ��Ʈ�� ����Ͽ� Ž���ϴ� ���� ������ ������ �������⵵���� ���̰� ����.
	//��������� ũ�Ⱑ ������ ������ ������ ������� ��������*���������̱� ������ ���� ���⵵�� O(v^2)�̴�.
	//�ݸ� ���Ḯ��Ʈ�� �ʿ��� ������ ���� ������ O(V+E)�� �ȴ�.
	//��������� �ͼ��ϰ�, ���� �� ���� ������ �� �־� ���� ��������� ��������Ʈ�� �� ȿ�����̴�.
}