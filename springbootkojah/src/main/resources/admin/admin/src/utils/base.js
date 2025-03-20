const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootkojah/",
            name: "springbootkojah",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的来访管理系统的设计与实现"
        } 
    }
}
export default base
