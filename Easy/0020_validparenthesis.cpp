// Efficiency O(n)

class Solution {
public:
    bool isValid(string s) {
        // Create a vector to act as a stack, storing order of parenthesis
        std::vector <char> stack;

        // Iterate through string, evaluating each char
        for (char c : s) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push_back(c);
                    break;
                case ')':
                    if (stack.empty() || stack.back() != '(') {
                        return false;
                    }
                    stack.pop_back();
                    break;
                case '}':
                    if (stack.empty() || stack.back() != '{') {
                        return false;
                    }
                    stack.pop_back();
                    break;
                case ']':
                    if (stack.empty() || stack.back() != '[') {
                        return false;
                    }
                    stack.pop_back();
                    break;
            }
        }

        return stack.empty();

    }
};
