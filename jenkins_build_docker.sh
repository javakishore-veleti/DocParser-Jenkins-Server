CURR_DIR=$(dirname $0)
docker build -t dp-devops-jenkins-server -f ${CURR_DIR}/Dockerfile ${CURR_DIR}
