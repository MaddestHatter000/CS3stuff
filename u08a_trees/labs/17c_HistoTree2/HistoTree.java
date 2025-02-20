//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

public class HistoTree
{
   private TreeNode root;

	public HistoTree( )
	{

	}

	public void addData(Comparable data)
	{
		root = add(data, root);
	}

	private TreeNode add(Comparable data, TreeNode tree)
	{
		if(tree == null){
			return new TreeNode(new ThingCount(data,1));
		}
		if(((ThingCount)tree.getValue()).getThing().equals(data)){
			((ThingCount)tree.getValue()).setCount(((ThingCount)tree.getValue()).getCount() + 1);
		}
		else if(((Comparable)((ThingCount)tree.getValue()).getThing()).compareTo(data) > 0){
			tree.setLeft(add(data, tree.getLeft()));
		}
		else{
			tree.setRight(add(data, tree.getRight()));
		}
		return tree;
	}

	private TreeNode search(Comparable data)
	{
		return search(data, root);
	}

	private TreeNode search(Comparable data, TreeNode tree)
	{
		if(tree == null){
			return null;
		}
		if(((ThingCount)tree.getValue()).getThing().equals(data)){
			return tree;
		}
		if(((Comparable)((ThingCount)tree.getValue()).getThing()).compareTo(data) > 0){
			return search(data, tree.getLeft());
		}
		return search(data, tree.getRight());
	}

	public String toString()
	{
		return toString(root);
	}

	private String toString(TreeNode tree)
	{
		if (tree == null) {
			return "";
		}
		return toString(tree.getLeft()) + tree.getValue().toString() + " " + toString(tree.getRight());
	}
}