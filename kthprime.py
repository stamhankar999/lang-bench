def is_prime(n):
  for num in range(2, n//2):
    if n%num == 0:
      return False
  return True

def kth_prime(k):
  candidate = 2
  while k:
    if is_prime(candidate):
      k -= 1
    candidate += 1
  return candidate - 1

# Driver code
print(kth_prime(10000)) # The 10000th prime number is 104723
