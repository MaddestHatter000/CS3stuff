//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

public class HistoTree
{
   private HistoNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		root = add(data, root);
	}

	private HistoNode add(Comparable data, HistoNode tree)
	{
		if(tree == null)
			return new HistoNode(data, 1, null, null);
		if(tree.getData().equals(data)){
			tree.setDataCount(tree.getDataCount() + 1);
		}
		if(data.compareTo(tree.getData()) < 0){
            tree.setLeft(add(data, tree.getLeft()));
        } else {
            tree.setRight(add(data, tree.getRight()));
        }
        return tree;
	}

	public HistoNode search(Comparable data)
	{
		return search(data, root);
	}

	private HistoNode search(Comparable data, HistoNode tree)
	{
		if(tree == null)
			return null;
		if(tree.getData().equals(data))
			return tree;
		if(data.compareTo(tree.getData()) < 0)
			return search(data, tree.getLeft());
		return search(data, tree.getRight());
	}

	public String toString()
	{
		return toString(root);
	}

	private String toString(HistoNode tree)
	{
		if (tree == null) {
			return "";
		}
		return toString(tree.getLeft()) + tree.getData() + " - " + tree.getDataCount() + "    " + toString(tree.getRight());
	}
}