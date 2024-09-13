import java.util.ArrayList;
import static java.lang.System.*;

@SuppressWarnings("unchecked")
public class HeapSortComparableWithIV<T extends Comparable<T>>
{
	private ArrayList<T> list;

	public HeapSortComparable()
	{
		list = new ArrayList<T>();
	}

   public void heapSort(int[] nums)
   {
   	for(Integer item : nums)
   	{
   		list.add(item);
   	}
   	for(int i = 1; i<nums.length; i++)
   	{
   		swapUp(i);
   	}
   	for(int i=list.size()-1; i>=1; i--)
   	{
   		swap(0, i);
   		swapDown(i-1);   		
   	}   	
   }   

   public void swapUp(int index)
   {
   	int bot = index;
		while(bot>0)
		{
			int parent = (bot-1)/2;
			if(list.get(parent).compareTo(list.get(bot)) < 0)
			{
				swap(parent, bot);
				bot=parent;
			}
			else{
				break;
			}
		}
	}

	public void swapDown(int index)
	{
		int root=0;
		while(root<index)
		{
			int max=0;
		   int left = root * 2 + 1;
		   int right = root * 2 + 2;

    		if(left < index)
			{
				if(right < index)
				{
					if (list.get(left).compareTo(list.get(right)) <= 0)
					{
						max = right;
					}
					else{
						max = left;
					}
				}
				else
					max = left;
			}
			else break;

			if (list.get(root).compareTo(list.get(max)) < 0)
			{
				swap(root, max);
				root=max;
			}
			else break;
		}
	}
   
   private void swap(int first, int last)
   {
   	T temp = list.get(first);
   	list.set(first, list.get(last));
   	list.set(last, temp);
   }

	public String toString()
	{
		return list.toString();
	}
}