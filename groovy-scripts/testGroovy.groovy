#!/bin/bash
curl -X POST -i -H "Content-type: application/json" -X POST http://localhost:3330/api/v1/ecatt-service/run-ecatt-crm-test -d '
    {
     	"pathToYMLFile" : "http://stash.standardbank.co.za:7990/projects/CBDEV/repos/feature-team-config/raw/sanity-config.yml",
     	"featureTeam" : "SANITY",
     	"username" : "A160976",
     	"password" : "Lewi$1703"
    }
    '
