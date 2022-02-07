import Vue from 'vue'
import Router from 'vue-router'

import HelloWorld from '@/components/HelloWorld'
import About from '@/components/about'
import Baidu from '@/components/baidu'

Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', name: 'HelloWorld', component: HelloWorld},
    {path: '/baidu', name: 'baidu', component: Baidu},
    {path: '/about', name: 'about', component: About}
  ]
})
