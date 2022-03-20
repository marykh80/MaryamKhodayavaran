from SocialMedia import SocialMedia
class Twitter(SocialMedia):
	
	def __init__(self, name, tweets):
		super().__init__(name)
		self.name = name
		self.tweets = []

	def createNewTweet(self, body1):
		body1 = input('Enter the body of your tweet:')
		if len(body1)<=280:

			self.tweets.append(body1)
		else:
			print('your tweet can not be uploaded!')

def getTweets(self):
    return tweets

r1 = Twitter('Twitter')	
print(r1.getName())	
		

