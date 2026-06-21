def call(String status) {

    if (status == "SUCCESS") {
        echo "================================="
        echo "Pipeline Executed Successfully"
        echo "================================="
    }

    else if (status == "FAILURE") {
        echo "================================="
        echo "Pipeline Execution Failed"
        echo "================================="
    }

    else {
        echo "Pipeline Status : ${status}"
    }
}