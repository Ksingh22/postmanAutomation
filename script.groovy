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
    bat  newman run ${COLLECTION}\
         -- environment ${QA}
         --reporters cli,junit,htmlextra \
         --reporter-junit-export "newman/report.xml" \
         --reporter-htmlextra-export "newman/report.html"
}
 return this