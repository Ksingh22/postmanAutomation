def checknpm(){
    echo "check npm version version"

        bat "npm --version"
       
        bat    "node --version"
        bat    "newman --version"
    
}
def installdependencies(){
    echo "intalling node, newman, npm"
    
    bat "npm install -g npm"
    bat "npm install node"
    bat "npm install newman"

}

def runPostmanCollection(){
    echo "running postman collection"
    dir('newman')
    bat  "newman run ${COLLECTION}\
         -- environment ${QA}\
         --reporters cli,htmlextra \
         --reporter-htmlextra-export "newman/report.html""
}

 return this