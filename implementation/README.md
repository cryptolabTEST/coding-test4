# CryptoLab Frontend Implementation

- date : 2023. 10. 11 Wed
- time : 1pm ~ 3pm

## Todo

- [x] init projects
- make route
  - [ ] 아래의 suburl을 입력했을 때 해당 화면으로 라우팅되어야 합니다.
    1.  `/` : main page (4)
    2.  `/space`: space page (5)
    3.  `/space/iss`: iss page (6-a)
    4.  `/space/people`: people page (6-b)
- make UI

  - [ ] main page는 아래의 규칙을 따라야 합니다.

    1.  화면의 하단에 버튼 하나가 있어야 합니다. 버튼을 클릭할 경우 space page로 이동해야 합니다.
    2.  버튼을 제외한 나머지 화면의 중앙에 “Hello, world!”가 있어야 합니다.

  - [ ] space page는 아래의 규칙을 따라야 합니다.

    1.  6-a 혹은 6-b에서 정해준 데이터를 주어진 서버에 RESTful API로 제출해야 합니다.
        1. 서버의 url은 ([https://26060a74-07a3-4ba9-9632-1e5a6bc69f4f.mock.pstmn.io](https://26060a74-07a3-4ba9-9632-1e5a6bc69f4f.mock.pstmn.io/)) 입니다.
        2. POST method를 사용해야 합니다.
        3. body는 json 형식이어야 합니다.
    2.  각각 ISS, people 이라고 적힌 두 개의 버튼이 있어야 합니다. 배치는 자유입니다.

  - implement 기능
    1. http://open-notify.org/ 를 참고하여 다음의 i, ii 중 하나 이상을 구현하여야 합니다.
       - [ ] `/space`에서 ISS 버튼을 클릭하면 ISS 버튼과 새로고침 버튼이 있는 화면(`/space/iss`)으로 이동해야합니다. ISS 버튼을 클릭하면 현재 국제우주정거장의 위치, 즉 위도와 경도가 보여야 합니다. 새로고침 버튼은 ISS의 위치를 새로 갱신해야 하지만 페이지를 실제로 새로고침 해서는 안됩니다. 처음 위치가 띄워졌을 때, 새로고침 될 때마다 그 정보(위도와 경도)를 서버에 보내야 합니다.
       - [ ] `/space`에서 people 버튼을 클릭하면 화면이 전환되고(`/space/people`) 현재 우주에 체류 중인 사람들의 목록이 버튼으로 나와야 합니다. 버튼은 한 줄에 세 개를 배치하십시오. 이 버튼들을 클릭하면 버튼 위에 이름 대신 각 사람들이 머무르는 우주 정거장이 표시되었다 사라져야합니다. 그리고 버튼 위에 다시 이름이 나타나야 합니다. 각 버튼을 누를 때마다 그 사람의 정보(이름과 체류 장소)를 서버로 보내야 합니다.
