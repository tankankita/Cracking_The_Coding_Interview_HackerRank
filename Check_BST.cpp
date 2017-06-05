/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node struct is defined as follows:
   struct Node {
      int data;
      Node* left;
      Node* right;
   }
*/
   vector<int> list;

    void checktree(Node* node)
    {

        if(node == NULL)
        {
            return;
        }
        checktree(node->left);
        list.push_back(node->data);
        checktree(node->right);
    }

    bool checkBST(Node* root)
    {
        checktree(root);
        for(int i = 1; i < list.size(); i++)
        {
            if(list[i] <= list[i-1])
            {
                return false;
            }
        }
        return true;
    }
