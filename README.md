# 시작하기

## Base Project 다운로드 및 실행
먼저, 새로운 브라우저 탭을 열고, base project 를 gitpod 로 접속합니다
https://gitpod.io/#https://github.com/msa-school/ddd-petstore-level6-layered-spring-jpa

GidPod 내에 터미널을 열고(왼쪽 상단의 햄버거 버튼 > Terminal > New Terminal), 프로젝트가 잘 컴파일 되는지 확인합니다:
```
mvn spring-boot:run
```

## 미션: pet 의 각 기능들을 호출하는 REST API 를 만드시오

- 새로운 터미널을 열어 pet을 한 마리 등록해 줍니다.

```
http POST :8081/cats name="몽이" energy=1
http GET :8081/cats/1
http PATCH :8081/cats/1 energy=2
# http DELETE :8081/cats/1 
```

- Pet 에 먹이를 한번 줘봅니다.
```
http PUT "http://localhost:8081/cats/1/feed"
```

- Pet 의 에너지가 상승함을 확인합니다.
```javascript
http "http://localhost:8081/cats/1"
```

- Pet 의 털도 한번 가꿔봅니다:
```javascript
http PUT "http://localhost:8081/cats/1/groom"
```


- Pet 의 외모지수가 상승함을 확인합니다.
```javascript
http "http://localhost:8081/cats/1"
```

## 다음: 도메인 영역의 분리와 연동
- Pet <-> Store 도메인의 분리 (Bounded Context)
- 도메인간 연동 (Context Mapping, Anti-corruption)
- https://github.com/event-storming/ddd-petstore


