package embed_java;

public class S2V_node {
	public int req_count;
	public int[] req=new int[Constant.MAX_REQ_PER_NODE];
	public int[] vnode=new int[Constant.MAX_REQ_PER_NODE];
	public double[] cpu=new double[Constant.MAX_REQ_PER_NODE];
	public double rest_cpu;
}
