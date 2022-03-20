from SocialMedia import SocialMedia
class Instagram(SocialMedia):
	
	def __init__(self, name, posts):
		super().__init__(name)
		self.name = name
		self.posts = []

	def publishNewPost(self, body2):
		body2 = input("Enter the body of your post:")
		if len(body2)<= 2200:
			
			self.posts.append(body2)
		else:
			print('The post can not be uploaded!')

def getPosts(self)
	return posts	

r2 = Instagram('Instagram')	
print(r2.getName())		

	
