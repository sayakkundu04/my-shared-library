def call(def branch, def url) {

    script {
        git branch: branch, credentialsId: 'github-token', url: url
            sh 'ls'
            sh 'pwd'
    }
}
