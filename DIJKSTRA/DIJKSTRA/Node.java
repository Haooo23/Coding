import java.util.*;

public class Node implements Comparable<Node> {
    private String id;
    private List<Edge> edges = new ArrayList<Edge>();
    private int minDistance = Integer.MAX_VALUE;
    private Node previous;
  
    public Node(String id) {
      this.id = id;
    }
  
    public String getId() {
      return id;
    }
  
    public List<Edge> getEdges() {
      return edges;
    }
  
    public int getMinDistance() {
      return minDistance;
    }
  
    public void setMinDistance(int minDistance) {
      this.minDistance = minDistance;
    }
  
    public Node getPrevious() {
      return previous;
    }
  
    public void setPrevious(Node previous) {
      this.previous = previous;
    }
  
    public int compareTo(Node other) {
      return Integer.compare(minDistance, other.getMinDistance());
    }
  
    public void addEdge(Edge edge) {
      edges.add(edge);
    }
  }