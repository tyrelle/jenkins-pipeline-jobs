import groovy.json.JsonSlurper
import groovy.json.StreamingJsonBuilder

def wine_requ = [
  pathToYMLFile : "http://stash.standardbank.co.za:7990/projects/CBDEV/repos/feature-team-config/raw/sanity-config.yml",
  featureTeam : "SANITY",
  username : "AO_USR",
  password : "Supp0rt!"
]

def url = new URL("http://localhost:3330/api/v1/ecatt-service/run-ecatt-crm-test")
def wine_resp = url.openConnection().with {
    requestMethod = "POST"
    doOutput = true
    setRequestProperty("Content-Type", "application/json;charset=UTF-8")
    outputStream.withWriter("UTF-8") { new StreamingJsonBuilder(it, wine_requ) }
    new JsonSlurper().parse(inputStream.newReader("UTF-8"))
}

//println "output = " + wine_resp.overallStatus
println "output = FAILED"
exit=1
