/**
* Pseudo code.
* List all files in a directory.
* preorder traversal.
*/

private void listAll(int depth) {
	printName(depth);
	if(isDirectory())
		for each file c in this directory(for each child)
			c.listAll(depth + 1);
}

public void listAll()
{
	listAll(0);
}