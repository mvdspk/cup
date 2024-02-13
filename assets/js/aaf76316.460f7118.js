"use strict";(self.webpackChunkcup=self.webpackChunkcup||[]).push([[257],{7364:(e,n,t)=>{t.r(n),t.d(n,{assets:()=>d,contentTitle:()=>a,default:()=>c,frontMatter:()=>s,metadata:()=>o,toc:()=>l});var r=t(5893),i=t(1151);const s={},a="Two Sum",o={id:"programming/blind75/twoSum",title:"Two Sum",description:"Given an array of numbers, and a int target, return indices  [i,j] suh that arr[i] + arr[j] = target",source:"@site/docs/programming/blind75/twoSum.md",sourceDirName:"programming/blind75",slug:"/programming/blind75/twoSum",permalink:"/cup/docs/programming/blind75/twoSum",draft:!1,unlisted:!1,editUrl:"https://github.com/facebook/docusaurus/tree/main/packages/create-docusaurus/templates/shared/docs/programming/blind75/twoSum.md",tags:[],version:"current",frontMatter:{},sidebar:"tutorialSidebar",previous:{title:"Programming",permalink:"/cup/docs/programming/"},next:{title:"Java",permalink:"/cup/docs/programming/java"}},d={},l=[{value:"Solutions",id:"solutions",level:2},{value:"Tests",id:"tests",level:2},{value:"Test 1: Pair Found",id:"test-1-pair-found",level:3},{value:"Test 2: Pair Not Found",id:"test-2-pair-not-found",level:3},{value:"Test 3: Empty array",id:"test-3-empty-array",level:3},{value:"Test 3: single element array",id:"test-3-single-element-array",level:3}];function u(e){const n={code:"code",h1:"h1",h2:"h2",h3:"h3",p:"p",pre:"pre",table:"table",tbody:"tbody",td:"td",th:"th",thead:"thead",tr:"tr",...(0,i.a)(),...e.components};return(0,r.jsxs)(r.Fragment,{children:[(0,r.jsx)(n.h1,{id:"two-sum",children:"Two Sum"}),"\n",(0,r.jsxs)(n.p,{children:["Given an ",(0,r.jsx)(n.code,{children:"array of numbers"}),", and a int ",(0,r.jsx)(n.code,{children:"target"}),", return indices  ",(0,r.jsx)(n.code,{children:"[i,j]"})," suh that ",(0,r.jsx)(n.code,{children:"arr[i] + arr[j] = target"})]}),"\n",(0,r.jsx)(n.h2,{id:"solutions",children:"Solutions"}),"\n",(0,r.jsxs)(n.table,{children:[(0,r.jsx)(n.thead,{children:(0,r.jsxs)(n.tr,{children:[(0,r.jsx)(n.th,{children:"id"}),(0,r.jsx)(n.th,{children:"solution"}),(0,r.jsx)(n.th,{children:"time complexity"}),(0,r.jsx)(n.th,{children:"space complexity"})]})}),(0,r.jsxs)(n.tbody,{children:[(0,r.jsxs)(n.tr,{children:[(0,r.jsx)(n.td,{children:"1"}),(0,r.jsx)(n.td,{children:"use hashmap"}),(0,r.jsx)(n.td,{children:"n"}),(0,r.jsx)(n.td,{children:"n"})]}),(0,r.jsxs)(n.tr,{children:[(0,r.jsx)(n.td,{children:"2"}),(0,r.jsx)(n.td,{children:"sort and check for neighbor item same"}),(0,r.jsx)(n.td,{children:"nlogn + n = nlogn"}),(0,r.jsx)(n.td,{children:"1 no additionalspace used"})]}),(0,r.jsxs)(n.tr,{children:[(0,r.jsx)(n.td,{children:"3"}),(0,r.jsx)(n.td,{children:"brute force"}),(0,r.jsx)(n.td,{children:"n^2"}),(0,r.jsx)(n.td,{children:"1"})]})]})]}),"\n",(0,r.jsx)(n.h2,{id:"tests",children:"Tests"}),"\n",(0,r.jsx)(n.h3,{id:"test-1-pair-found",children:"Test 1: Pair Found"}),"\n",(0,r.jsx)(n.p,{children:"input: nums = [1, 2, 3, 4, 5 ], target = 3\noutput: pair = [0,1]"}),"\n",(0,r.jsx)(n.h3,{id:"test-2-pair-not-found",children:"Test 2: Pair Not Found"}),"\n",(0,r.jsx)(n.p,{children:"input: nums = [1, 2, 3, 4, 5 ], target = 15\noutput: pair = [-1,-1]"}),"\n",(0,r.jsx)(n.h3,{id:"test-3-empty-array",children:"Test 3: Empty array"}),"\n",(0,r.jsx)(n.p,{children:"input: nums = [], target = 3\noutput: pair = [-1,-1]"}),"\n",(0,r.jsx)(n.h3,{id:"test-3-single-element-array",children:"Test 3: single element array"}),"\n",(0,r.jsx)(n.p,{children:"input: nums = [1], target = 3\noutput: pair = [-1,-1]"}),"\n",(0,r.jsx)(n.pre,{children:(0,r.jsx)(n.code,{className:"language-java",children:"public class TwoSum {\n    public int[] usingHashMap(int nums[], int target) {\n        int pair[] = { -1, -1 };\n\n        Map<Integer, Integer> lookup = new HashMap<>();\n\n        for (int i = 0; i < nums.length; i++) {\n            int num = nums[i];\n            int otherNum = target - num;\n            if (lookup.containsKey(otherNum)) {\n                pair[0] = i;\n                pair[1] = lookup.get(otherNum);\n            } else {\n                lookup.put(num, i);\n            }\n        }\n        return pair;\n    }\n}\n"})})]})}function c(e={}){const{wrapper:n}={...(0,i.a)(),...e.components};return n?(0,r.jsx)(n,{...e,children:(0,r.jsx)(u,{...e})}):u(e)}},1151:(e,n,t)=>{t.d(n,{Z:()=>o,a:()=>a});var r=t(7294);const i={},s=r.createContext(i);function a(e){const n=r.useContext(s);return r.useMemo((function(){return"function"==typeof e?e(n):{...n,...e}}),[n,e])}function o(e){let n;return n=e.disableParentContext?"function"==typeof e.components?e.components(i):e.components||i:a(e.components),r.createElement(s.Provider,{value:n},e.children)}}}]);