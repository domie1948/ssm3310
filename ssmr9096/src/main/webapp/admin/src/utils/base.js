const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmr9096/",
            name: "ssmr9096",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmr9096/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "培训机构运营系统"
        } 
    }
}
export default base
