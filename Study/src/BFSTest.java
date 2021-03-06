import java.util.*;

//인접행렬과 해쉬 테이블 사용한 BFS
public class BFSTest {
	
	static int Ne; //간선의 수
	static int Nv; //정점의 수
	static int[][] adjacencyMatrix; //인접행렬
	static boolean[] visit; //정점 방문 확인
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
		Nv = scan.nextInt(); //정점 갯수 입력
		Ne = scan.nextInt(); //간선 갯수 입력
		
		adjacencyMatrix = new int[Nv+1][Nv+1];
		visit = new boolean[Nv+1];
		
		for(int i = 0; i < Nv; i++)
		{
			int t1, t2; //연결된 간선. t1과 t2는 정점이며 간선은 따로 표기하지 않기 때문에 행렬에서 이둘이 연결됐음을 표기
			t1 = scan.nextInt();
			t2 = scan.nextInt();
			
			adjacencyMatrix[t1][t2] = adjacencyMatrix[t2][t1] = 1;
		}
		
		bfs(1);
	}
	
	//인접행렬(배열)을 사용하여 탐색하는 것과 연결리스트를 사용하여 탐색하는 것은 목적은 같지만 공간복잡도에서 차이가 난다.
	//인접행렬은 크기가 정점과 간선의 갯수와 상관없이 점점갯수*정점갯수이기 때문에 공간 복잡도가 O(v^2)이다.
	//반면 연결리스트는 필요한 공간만 쓰기 때문에 O(V+E)가 된다.
	//인접행렬이 익숙하고, 조금 더 쉽게 이해할 수 있어 많이 사용하지만 인접리스트가 더 효율적이다.
}
