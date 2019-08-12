package Core;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {

	public static void generateBFS(int s,CreateGraph bfs){
		LinkedList<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		while(queue.size()!=0) {
			s=queue.poll();
			System.out.print(s+" ");
			bfs.visited[s]=true;
			Iterator<Integer> values=bfs.adj[s].listIterator();
			while(values.hasNext()) {
				int value=values.next();
				if(!bfs.visited[value]) {
					bfs.visited[value]=true;
					queue.add(value);
				}
			}
		}

	}
	public static void main(String[] args) {
		CreateGraph bfs=new CreateGraph(6);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 3);
		bfs.addEdge(1, 4);
		bfs.addEdge(2, 4);
		bfs.addEdge(3, 4);
		bfs.addEdge(3, 5);
		bfs.addEdge(4, 5);

		generateBFS(0,bfs);
	}

}
