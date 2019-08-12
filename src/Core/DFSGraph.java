package Core;

import java.util.Iterator;

public class DFSGraph {

	public static void main(String[] args) {
		CreateGraph dfs=new CreateGraph(6);
		dfs.addEdge(0, 1);
		dfs.addEdge(0, 2);
		dfs.addEdge(1, 3);
		dfs.addEdge(1, 4);
		dfs.addEdge(2, 4);
		dfs.addEdge(3, 4);
		dfs.addEdge(3, 5);
		dfs.addEdge(4, 5);

		generateDFS(0,dfs);
	}

	private static void generateDFS(int i, CreateGraph dfs) {
		dfs.visited[i]=true;
		System.out.print(i);
		Iterator<Integer> values=dfs.adj[i].listIterator();
		while(values.hasNext()) {
			int s=values.next();
			if(!dfs.visited[s])
				generateDFS(s,dfs);
		}
	}

}
