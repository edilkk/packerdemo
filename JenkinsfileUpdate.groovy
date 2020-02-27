node{
    stage("Pull Repo"){
        git "https://github.com/edilkk/packerdemo.git"
    }
    stage("Build AMI"){
        sh "packer build updated/updated.json"
    }
}