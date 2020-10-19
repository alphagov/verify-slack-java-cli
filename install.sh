#!/bin/bash

./gradlew clean installDist

cat > slack-cli << EOF
#!/bin/bash
cd $(dirname `realpath "$0"`)/build/install/verify-slack-java-cli/bin

./verify-slack-java-cli \$*
EOF

chmod +x ./slack-cli