package embed_java;

public class Request {
	public int split;
	public int time;
	public int topo;
	public int duration;
	public int nodes;
	public int links;
	public double revenue;
	public double[] cpu= new double[Constant.MAX_REQ_NODES];
	public Link[] link=new Link[Constant.MAX_REQ_LINKS];
}
