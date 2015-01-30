package embed_java;

public class Constant {
	
	public static final int MAX_REQUESTS=10000;
	
	public static final int MAX_REQ_NODES=100;
	public static final int MAX_REQ_LINKS=100;
	
	public static final int MAX_REQ_PER_NODE=1000;
	
	public static final int MAX_SUB_NODES=1000;
	public static final int MAX_SUB_LINKS=10000;
	
	public static final int LEN_FILENAME=100;
	
	public static final int MAX_CPU=100;
	public static final int MAX_BW=100;
	
	public static final int MAX_NECK_COUNT=100;
	
	public static final int TOPO_GENERAL=0;
	public static final int TOPO_STAR=1;
	public static final int TOPO_TREE=2;
	public static final int TOPO_HUBS=3;
	
	public static final int STATE_MAP_NODE_FAIL=-1;
	public static final int STATE_NEW=0;
	public static final int STATE_MAP_NODE=1;
	public static final int STATE_MAP_LINK=2;
	public static final int STATE_DONE=3;
	public static final int STATE_EXPIRE=4;
	
	public static final int NO_MIGRATION=0;
	public static final int ROUTE_MIGRATION=1;
	public static final int NODE_MIGRATION=2;
	
	public static final int LINK_SPLITTABLE=0;
	public static final int LINK_UNSPLITTABLE=1;
	
	public static final int  TIMES_TRY=1;
	
	public static final int MAX_SNODE_PER_PATH=100;
	public static final int MAX_SLINK_PER_VLINK=100;
}
