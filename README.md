# hackerskeyboard_exampleplugin
Example plugin for Hacker's Keyboard using Plugin Keyboard
## Integration into Plugin Keyboard
Run

    git clone https://github.com/n4experiments/pluginkeyboard
    find pluginkeyboard -type f -exec sed -i 's/GREP_APPID/com.example.pluginkeyboard/g' {} +
    find pluginkeyboard -type f -exec sed -i 's/GREP_APP_NAME/Hackers Keyboard Example Plugin/g' {} +
    mv com/ pluginkeyboard/app/src/main/java/
    
and build pluginkeyboard/app/
