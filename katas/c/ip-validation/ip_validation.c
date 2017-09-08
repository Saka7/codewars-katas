#include <arpa/inet.h>

int is_valid_ip(const char* addr) {
  struct sockaddr_in sock_addr;
  return inet_pton(AF_INET, addr, &(sock_addr.sin_addr));
}