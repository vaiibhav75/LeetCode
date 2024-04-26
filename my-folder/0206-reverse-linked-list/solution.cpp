/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
private:
    ListNode *pointer;
public:

    ListNode* reverseList(ListNode* head) {
        solve(head);
        return pointer;
    }

    ListNode* solve(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            pointer = head;
            return pointer;
        }
        solve(head->next)->next = head;
        head->next = nullptr;
        return head;
    }
};
