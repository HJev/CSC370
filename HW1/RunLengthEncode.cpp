#include <string>


class RunLengthEncode{
    public:
    static std::string encode(std::string text){
        std::string result = "";
        int i = 1;
        char curr = text[0];
        for (int j = 0; j < text.length(); j++){
            if(curr == text[j])
                i++;
            else{
                if(i > 4){
                    char temp[4];
                    sprintf(temp,"/%.2d%c", i, curr);
                    result += temp;
                }else {
                    result += std::string(i,curr);
                }
                i = 1;
                curr = text[j];
            }
        }
        if(i > 4){
            char temp[4];
            sprintf(temp,"/%.2d%c", i, curr);
            result += temp;
        }else {
            result += std::string(i,curr);
        }
        return result;
    }
};