# spring-msa
스프링 MSA 공부 시작!

# Config 관리
## 필요성
일반적으로 이런 프로퍼티들은 어플리케이션이 설치되는 곳에 환경변수로 저장하거나 특정 패스에 파일을 저장해서 가져오는 방식을 사용한다.
이는 어렵지 않으나 여러 개의 마이크로서비스와 마이크로 인스턴스를 사용하게 되면 문제가 된다고 한다.
환경변수, 설정파일이 어디에 저장되고 어떤 형식으로 저장할지 결정해야 하기 때문
순서  
1. 깃허브에 프로퍼티 생성
2. Config Server 생성
3. Config Client 생성
4. Actuator로 자동 리프레쉬 테스트  
- [스프링 클라우드 서버](https://github.com/ssisksl77/spring-msa/tree/master/spring-config-server)  
- [스프링 클라우드 클라이언트](https://github.com/ssisksl77/spring-msa/tree/master/spring-config-client-1)
