#include<iostream>

using namespace std;

struct Node {
    int data;
    struct Node* next;
    Node(int data)
    {
        this->data = data;
        next = NULL;
    }
};
struct LinkedList {
    Node* head;
    LinkedList() 
    {   head = NULL;}     

void reverse()
    {
        Node* curr = head;
        Node *prev = NULL, *next = NULL;
 
        while (curr != NULL) {
            next = curr->next;
            curr->next = prev;
 
            prev = curr;
            curr = next;
        }
        head = prev;
    }

void add(int data)
    {
        Node* temp = new Node(data);
        temp->next = head;
        head = temp;
    }
void print()
    {
        struct Node* temp = head;
        while (temp != NULL) {
            cout << temp->data << " ";
            temp = temp->next;
        }
    }
};

int main()
{
    LinkedList List;
    List.add(10);
    List.add(20);
    List.add(30);
    List.add(40);
 
    cout << "Before\n";
    List.print();
 
    List.reverse();
 
    cout << "\nAfter reversing \n";
    List.print();

    return 0;
}